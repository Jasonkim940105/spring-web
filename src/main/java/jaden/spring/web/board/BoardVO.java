package jaden.spring.web.board;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.annotation.*;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
public class BoardVO {
    @XmlAttribute
    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date regdate;
    private int cnt;
    @XmlTransient
    private String searchCondition;
    @XmlTransient
    private String searchKeyword;
    @XmlTransient
    private MultipartFile uploadFile;

    @JsonIgnore
    public MultipartFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile) {
        this.uploadFile = uploadFile;
    }

    @JsonIgnore
    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    @JsonIgnore
    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        String str = "seq : "  + seq + " title : " + title + " writer : " + writer + " content :" + content;
        return str;
    }
}
