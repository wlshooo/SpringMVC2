package hello.itemservice.web.validation.form;


import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @Range(min = 1000,max=1000000)
    @NotNull
    private Integer price;

    //수정에서 수량은 자유롭게 변경가능
    private Integer quantity;
}
