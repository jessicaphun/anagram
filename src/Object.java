public class Object {
    String textValue1;
    String textValue2;
    boolean result;

    public Object() {
    }

    public Object (String textValue1, String textValue2, boolean result){
        this.textValue1 = textValue1;
        this.textValue2 = textValue2;
        this.result = result;
    }

    public String getTextValue1() {
        return textValue1;
    }
    public String getTextValue2(){
        return textValue2;
    }

    public boolean isResult (){
        return result;
    }

    public String getResults() {
        return textValue1 + "," + textValue2 + ","+ result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
