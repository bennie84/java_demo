package com.example.postgresdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "questions")
public class Question extends AuditModel {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "date")
    private Integer planafspraak;
    private Integer geefEersteVrijeSlotVanaf;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getPlanAfspraak() {
        return planafspraak;
    }

    public void setPlanAfspraak(int planafspraak) {
        this.planafspraak = planafspraak;
    }
    public int getgeefEersteVrijeSlotVanaf() {
        return geefEersteVrijeSlotVanaf;
    }

    public void setgeefEersteVrijeSlotVanaf(int geefEersteVrijeSlotVanaf) {
        this.geefEersteVrijeSlotVanaf = geefEersteVrijeSlotVanaf;
    }
}
