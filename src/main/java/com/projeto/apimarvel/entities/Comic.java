package com.projeto.apimarvel.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_comic")
public class Comic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private Double price;

    @NotBlank
    private String author;

    @NotBlank
    private String isbn;

    @NotBlank
    private String description;

    @ManyToMany
    @JoinTable(name="tb_comic_author", //nome da nova tabela
            joinColumns = @JoinColumn(name="comic_id"),
            inverseJoinColumns = @JoinColumn(name="author_id"))
    public List<Author> authorList;

    @Deprecated
    public Comic() {
    }

    public Comic(Long id, String title, Double price, String author, String isbn, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
