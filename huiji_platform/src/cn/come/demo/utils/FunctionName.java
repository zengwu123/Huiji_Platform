package cn.come.demo.utils;

public enum FunctionName {
	
    //	1:���ӡ�2:ɾ����3:�޸ġ�4:�鿴��5:�鿴
	ADD("1","����"),DEL("2","ɾ��"),UPD("3","�޸�"),QUER("4","�鿴"),AUTH("5","�鿴");
    private String key;
	private String value;

	private FunctionName(String key,String value) {
		this.key=key;
		this.value=value;
	}
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
