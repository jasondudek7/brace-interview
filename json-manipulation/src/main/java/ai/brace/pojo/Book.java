package ai.brace.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/*

    Class for serialization / deserialization

 */
public class Book {

    private String version;
    private String uuid;
    private int lastModified;
    private String title;
    private String author;
    private String translator;
    private String releaseDate;
    private String language;
    private TextArray[] textArray;

    @SerializedName("version")
    public String getVersion() {
        return version;
    }

    @SerializedName("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @SerializedName("uuid")
    public String getUuid() {
        return uuid;
    }

    @SerializedName("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @SerializedName("lastModified")
    public int getLastModified() {
        return lastModified;
    }

    @SerializedName("lastModified")
    public void setLastModified(int lastModified) {
        this.lastModified = lastModified;
    }

    @SerializedName("title")
    public String getTitle() {
        return title;
    }

    @SerializedName("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("author")
    public String getAuthor() {
        return author;
    }

    @SerializedName("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @SerializedName("translator")
    public String getTranslator() {
        return translator;
    }

    @SerializedName("translator")
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    @SerializedName("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @SerializedName("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @SerializedName("language")
    public String getLanguage() {
        return language;
    }

    @SerializedName("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @SerializedName("textArray")
    public TextArray[] getTextArray() {
        return textArray;
    }

    @SerializedName("textArray")
    public void setTextArray(TextArray[] textArray) {
        this.textArray = textArray;
    }
}
