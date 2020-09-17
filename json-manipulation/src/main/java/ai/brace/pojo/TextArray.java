package ai.brace.pojo;

import com.google.gson.annotations.SerializedName;

public class TextArray {
    private int id;
    private String textdata;

    @SerializedName("id")
    public int getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(int id) {
        this.id = id;
    }

    @SerializedName("textdata")
    public String getTextdata() {
        return textdata;
    }

    @SerializedName("textdata")
    public void setTextdata(String textdata) {
        this.textdata = textdata;
    }
}
