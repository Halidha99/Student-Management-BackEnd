package edu.icet.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String fullName;
    private String dob;
    private String gender;
    private String email;
    private String phoneNumber;
    private String address;
    private String batchName;
    private String registerDate;
//    private String imageName;
//    private String imgePath;
@Lob
@Column(name = "image", columnDefinition = "LONGBLOB")
private byte[] image;


}
