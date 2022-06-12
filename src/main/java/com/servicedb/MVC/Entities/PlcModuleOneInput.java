package com.servicedb.MVC.Entities;

import javax.persistence.*;

@Entity
@Table(name = "plc_module_one_inputs")
public class PlcModuleOneInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_num", nullable = false)
    private Integer id;

    @Column(name = "in_use_0")
    private Boolean inUse0;

    @Column(name = "label_0", length = 100)
    private String label0;

    @Column(name = "in_use_1")
    private Boolean inUse1;

    @Column(name = "label_1", length = 100)
    private String label1;

    @Column(name = "in_use_2")
    private Boolean inUse2;

    @Column(name = "label_2", length = 100)
    private String label2;

    @Column(name = "in_use_3")
    private Boolean inUse3;

    @Column(name = "label_3", length = 100)
    private String label3;

    @Column(name = "in_use_4")
    private Boolean inUse4;

    @Column(name = "label_4", length = 100)
    private String label4;

    @Column(name = "in_use_5")
    private Boolean inUse5;

    @Column(name = "label_5", length = 100)
    private String label5;

    @Column(name = "in_use_6")
    private Boolean inUse6;

    @Column(name = "label_6", length = 100)
    private String label6;

    @Column(name = "in_use_7")
    private Boolean inUse7;

    @Column(name = "label_7", length = 100)
    private String label7;

    @Column(name = "in_use_8")
    private Boolean inUse8;

    @Column(name = "label_8", length = 100)
    private String label8;

    @Column(name = "label_9", length = 100)
    private String label9;

    @Column(name = "in_use_9")
    private Boolean inUse9;

    @Column(name = "in_use_10")
    private Boolean inUse10;

    @Column(name = "label_10", length = 100)
    private String label10;

    @Column(name = "in_use_11")
    private Boolean inUse11;

    @Column(name = "label_11", length = 100)
    private String label11;

    @Column(name = "in_use_12")
    private Boolean inUse12;

    @Column(name = "label_12", length = 100)
    private String label12;

    @Column(name = "in_use_13")
    private Boolean inUse13;

    @Column(name = "label_13", length = 100)
    private String label13;

    @Column(name = "in_use_14")
    private Boolean inUse14;

    @Column(name = "label_14", length = 100)
    private String label14;

    @Column(name = "in_use_15")
    private Boolean inUse15;

    @Column(name = "label_15", length = 100)
    private String label15;

    @Column(name = "instructions_0", length = 200)
    private String instructions0;

    @Column(name = "instructions_1", length = 200)
    private String instructions1;

    @Column(name = "instructions_2", length = 200)
    private String instructions2;

    @Column(name = "instructions_3", length = 200)
    private String instructions3;

    @Column(name = "instructions_4", length = 200)
    private String instructions4;

    @Column(name = "instructions_5", length = 200)
    private String instructions5;

    @Column(name = "instructions_6", length = 200)
    private String instructions6;

    @Column(name = "instructions_7", length = 200)
    private String instructions7;

    @Column(name = "instructions_8", length = 200)
    private String instructions8;

    @Column(name = "instructions_9", length = 200)
    private String instructions9;

    @Column(name = "instructions_10", length = 200)
    private String instructions10;

    @Column(name = "instructions_11", length = 200)
    private String instructions11;

    @Column(name = "instructions_12", length = 200)
    private String instructions12;

    @Column(name = "instructions_13", length = 200)
    private String instructions13;

    @Column(name = "instructions_14", length = 200)
    private String instructions14;

    @Column(name = "instructions_15", length = 200)
    private String instructions15;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getInUse0() {
        return inUse0;
    }

    public void setInUse0(Boolean inUse0) {
        this.inUse0 = inUse0;
    }

    public String getLabel0() {
        return label0;
    }

    public void setLabel0(String label0) {
        this.label0 = label0;
    }

    public Boolean getInUse1() {
        return inUse1;
    }

    public void setInUse1(Boolean inUse1) {
        this.inUse1 = inUse1;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public Boolean getInUse2() {
        return inUse2;
    }

    public void setInUse2(Boolean inUse2) {
        this.inUse2 = inUse2;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public Boolean getInUse3() {
        return inUse3;
    }

    public void setInUse3(Boolean inUse3) {
        this.inUse3 = inUse3;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public Boolean getInUse4() {
        return inUse4;
    }

    public void setInUse4(Boolean inUse4) {
        this.inUse4 = inUse4;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public Boolean getInUse5() {
        return inUse5;
    }

    public void setInUse5(Boolean inUse5) {
        this.inUse5 = inUse5;
    }

    public String getLabel5() {
        return label5;
    }

    public void setLabel5(String label5) {
        this.label5 = label5;
    }

    public Boolean getInUse6() {
        return inUse6;
    }

    public void setInUse6(Boolean inUse6) {
        this.inUse6 = inUse6;
    }

    public String getLabel6() {
        return label6;
    }

    public void setLabel6(String label6) {
        this.label6 = label6;
    }

    public Boolean getInUse7() {
        return inUse7;
    }

    public void setInUse7(Boolean inUse7) {
        this.inUse7 = inUse7;
    }

    public String getLabel7() {
        return label7;
    }

    public void setLabel7(String label7) {
        this.label7 = label7;
    }

    public Boolean getInUse8() {
        return inUse8;
    }

    public void setInUse8(Boolean inUse8) {
        this.inUse8 = inUse8;
    }

    public String getLabel8() {
        return label8;
    }

    public void setLabel8(String label8) {
        this.label8 = label8;
    }

    public String getLabel9() {
        return label9;
    }

    public void setLabel9(String label9) {
        this.label9 = label9;
    }

    public Boolean getInUse9() {
        return inUse9;
    }

    public void setInUse9(Boolean inUse9) {
        this.inUse9 = inUse9;
    }

    public Boolean getInUse10() {
        return inUse10;
    }

    public void setInUse10(Boolean inUse10) {
        this.inUse10 = inUse10;
    }

    public String getLabel10() {
        return label10;
    }

    public void setLabel10(String label10) {
        this.label10 = label10;
    }

    public Boolean getInUse11() {
        return inUse11;
    }

    public void setInUse11(Boolean inUse11) {
        this.inUse11 = inUse11;
    }

    public String getLabel11() {
        return label11;
    }

    public void setLabel11(String label11) {
        this.label11 = label11;
    }

    public Boolean getInUse12() {
        return inUse12;
    }

    public void setInUse12(Boolean inUse12) {
        this.inUse12 = inUse12;
    }

    public String getLabel12() {
        return label12;
    }

    public void setLabel12(String label12) {
        this.label12 = label12;
    }

    public Boolean getInUse13() {
        return inUse13;
    }

    public void setInUse13(Boolean inUse13) {
        this.inUse13 = inUse13;
    }

    public String getLabel13() {
        return label13;
    }

    public void setLabel13(String label13) {
        this.label13 = label13;
    }

    public Boolean getInUse14() {
        return inUse14;
    }

    public void setInUse14(Boolean inUse14) {
        this.inUse14 = inUse14;
    }

    public String getLabel14() {
        return label14;
    }

    public void setLabel14(String label14) {
        this.label14 = label14;
    }

    public Boolean getInUse15() {
        return inUse15;
    }

    public void setInUse15(Boolean inUse15) {
        this.inUse15 = inUse15;
    }

    public String getLabel15() {
        return label15;
    }

    public void setLabel15(String label15) {
        this.label15 = label15;
    }

    public String getInstructions0() {
        return instructions0;
    }

    public void setInstructions0(String instructions0) {
        this.instructions0 = instructions0;
    }

    public String getInstructions1() {
        return instructions1;
    }

    public void setInstructions1(String instructions1) {
        this.instructions1 = instructions1;
    }

    public String getInstructions2() {
        return instructions2;
    }

    public void setInstructions2(String instructions2) {
        this.instructions2 = instructions2;
    }

    public String getInstructions3() {
        return instructions3;
    }

    public void setInstructions3(String instructions3) {
        this.instructions3 = instructions3;
    }

    public String getInstructions4() {
        return instructions4;
    }

    public void setInstructions4(String instructions4) {
        this.instructions4 = instructions4;
    }

    public String getInstructions5() {
        return instructions5;
    }

    public void setInstructions5(String instructions5) {
        this.instructions5 = instructions5;
    }

    public String getInstructions6() {
        return instructions6;
    }

    public void setInstructions6(String instructions6) {
        this.instructions6 = instructions6;
    }

    public String getInstructions7() {
        return instructions7;
    }

    public void setInstructions7(String instructions7) {
        this.instructions7 = instructions7;
    }

    public String getInstructions8() {
        return instructions8;
    }

    public void setInstructions8(String instructions8) {
        this.instructions8 = instructions8;
    }

    public String getInstructions9() {
        return instructions9;
    }

    public void setInstructions9(String instructions9) {
        this.instructions9 = instructions9;
    }

    public String getInstructions10() {
        return instructions10;
    }

    public void setInstructions10(String instructions10) {
        this.instructions10 = instructions10;
    }

    public String getInstructions11() {
        return instructions11;
    }

    public void setInstructions11(String instructions11) {
        this.instructions11 = instructions11;
    }

    public String getInstructions12() {
        return instructions12;
    }

    public void setInstructions12(String instructions12) {
        this.instructions12 = instructions12;
    }

    public String getInstructions13() {
        return instructions13;
    }

    public void setInstructions13(String instructions13) {
        this.instructions13 = instructions13;
    }

    public String getInstructions14() {
        return instructions14;
    }

    public void setInstructions14(String instructions14) {
        this.instructions14 = instructions14;
    }

    public String getInstructions15() {
        return instructions15;
    }

    public void setInstructions15(String instructions15) {
        this.instructions15 = instructions15;
    }

}