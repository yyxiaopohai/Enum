package com.atguigu;

public enum  MyEnumCode {
    SPRING(1,"春天"),SUMMER(2,"夏天"),AUTUMN(3,"秋天"),WINTER(4,"冬天");
    private Integer code;
    private String message;

    MyEnumCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static MyEnumCode forEach_myEnumCode(int index){
        MyEnumCode[] values = MyEnumCode.values();
        for (MyEnumCode value : values) {
            if (index == value.getCode()){
                return value;
            }
        }
        return null;
    }
}
