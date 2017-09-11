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

public class PoiReadExcleUtil {
	
	public StringBuffer getExcelString(String filePath) throws Exception {
	StringBuffer str=new StringBuffer();
	InputStream is = new FileInputStream(filePath);
    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
    // 循环工作表Sheet
    for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
        if (hssfSheet == null) {
            continue;
        }
        // 循环行Row
        for (int rowNum = 2; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
            HSSFRow hssfRow = hssfSheet.getRow(rowNum);
           if (hssfRow == null) {
                continue;
            }
            HSSFCell xh = hssfRow.getCell(0);
            HSSFCell xm = hssfRow.getCell(1);
            HSSFCell yxsmc = hssfRow.getCell(2);
            HSSFCell kcm = hssfRow.getCell(3);
            HSSFCell kcm4 = hssfRow.getCell(4);
            
            str.append(getValue(xh)).append("@|");
            str.append(getValue(xm)).append("@|");
            str.append(getValue(yxsmc)).append("@|");
            str.append(getValue(kcm)).append("@|");
            if(Integer.parseInt(getValue(xm).trim())==3){
            	str.append(getValue(kcm4)).append("@|@|");
            }else{
            	HSSFCell kcm5 = hssfRow.getCell(5);
                HSSFCell kcm6 = hssfRow.getCell(6);
            	str.append(getValue(kcm4)).append("@|");
            	str.append(getValue(kcm5)).append("@|");
            	str.append(getValue(kcm6)).append("@|@|");
            }
        }
    }
	return str;
	
    }
	
	
    private static String getValue(HSSFCell hssfCell) {
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            // 返回布尔类型的值
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            // 返回数值类型的值
        	return String.valueOf(hssfCell.getNumericCellValue());
        } else {
            // 返回字符串类型的值
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }

}
