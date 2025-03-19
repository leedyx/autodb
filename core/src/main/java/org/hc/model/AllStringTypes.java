package org.hc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity(name = "all_string_types")
public class AllStringTypes {

    @Id
    @GeneratedValue
    private Long id;

    // 定长字符串
    @Column(name = "char_col", length = 10)
    private String charCol;

    @Column(name = "binary_col", columnDefinition = "BINARY(20)")
    private byte[] binaryCol;

    // 变长字符串
    @Column(name = "varchar_col", length = 255)
    private String varcharCol;

    @Column(name = "varbinary_col", columnDefinition = "VARBINARY(500)")
    private byte[] varbinaryCol;

    // 文本类型
    @Lob
    @Column(name = "tinytext_col")
    private String tinytextCol;

    @Lob
    @Column(name = "text_col")
    private String textCol;

    @Lob
    @Column(name = "mediumtext_col")
    private String mediumtextCol;

    @Lob
    @Column(name = "longtext_col")
    private String longtextCol;

    // 二进制大对象
    @Lob
    @Column(name = "tinyblob_col")
    private byte[] tinyblobCol;

    @Lob
    @Column(name = "blob_col")
    private byte[] blobCol;

    @Lob
    @Column(name = "mediumblob_col")
    private byte[] mediumblobCol;

    @Lob
    @Column(name = "longblob_col")
    private byte[] longblobCol;

    // 特殊集合类型
    @Column(name = "enum_col", columnDefinition = "ENUM('small', 'medium', 'large')")
    private String enumCol;

    @Column(name = "set_col", columnDefinition = "SET('a', 'b', 'c')")
    private String setCol;

}
