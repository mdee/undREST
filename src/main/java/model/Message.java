package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Simple model for representing text messages.
 * A table named 'message' with a columns for `id` & `text` would suffice
 * @author MDee
 *
 */
//@Entity
//@Table(name = "message")
//@SuppressWarnings("serial")
public class Message implements Serializable {

//    @Id
//    @GeneratedValue
//    @Column(name = "id", nullable = false)
    private Long id;

//    @Column(name = "text", nullable = false)
    private String text;

    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
