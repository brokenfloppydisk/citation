package lib.parse.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VolumeInfo {
    @JsonProperty("authors")
    private ArrayList<String> authors;

    @JsonProperty("title")
    private String title;

    @JsonProperty("publisher")
    private String publisher;

    // TODO: Stop using java.util.Date and switch to java.util.Calendar
    @JsonProperty("publishedDate")
    private Date publishDate;

    public VolumeInfo() {}

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getDate() {
        return publishDate;
    }


    public String toString() {
        return String.format(
            "Volume Info: {Title: %s, Publication Date: %s, Authors: {%s}}",
            title,
            publishDate.toString(),
            Arrays.toString(authors.toArray())
        );
    }
}