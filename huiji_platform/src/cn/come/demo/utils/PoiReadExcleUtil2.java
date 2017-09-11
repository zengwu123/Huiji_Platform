package cn.come.demo.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import cn.come.demo.po.TSubjectInfo;

public class PoiReadExcleUtil2 {
	
	public List<TSubjectInfo> getExcelString() throws Exception {
	InputStream is = new FileInputStream("C:Users/Administrator/Desktop/��Ŀ��Ϣ��.xls");
    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
    List<TSubjectInfo> list=new ArrayList<>();
    
    // ѭ��������Sheet
    for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
        if (hssfSheet == null) {
            continue;
        }
        // ѭ����Row
        for (int rowNum = 2; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
            HSSFRow hssfRow = hssfSheet.getRow(rowNum);
           if (hssfRow == null) {
                continue;
            }
           TSubjectInfo t=new TSubjectInfo();
            HSSFCell xh = hssfRow.getCell(0);
            t.setSubject_no(Long.valueOf(getValue(xh)));
            HSSFCell xm = hssfRow.getCell(1);
            t.setSubject_code(getValue(xm));
            HSSFCell yxsmc = hssfRow.getCell(2);
            t.setSubject_name(getValue(yxsmc));
            HSSFCell kcm = hssfRow.getCell(3);
            t.setFather_subject(Long.valueOf(getValue(kcm)));
            list.add(t);
        }
    }
	return list;
	
    }
	
	
    private static String getValue(HSSFCell hssfCell) {
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            // ���ز������͵�ֵ
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            // ������ֵ���͵�ֵ
        	return String.valueOf(hssfCell.getNumericCellValue());
        } else {
            // �����ַ������͵�ֵ
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }

}
