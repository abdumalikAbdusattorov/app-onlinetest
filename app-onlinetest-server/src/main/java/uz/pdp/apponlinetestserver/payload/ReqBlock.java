package uz.pdp.apponlinetestserver.payload;

import lombok.Data;
import uz.pdp.apponlinetestserver.entity.enums.Level;

@Data
public class ReqBlock {
    private Integer id;
    private String nameUz;
    private String nameRu;
    private Level level;
}
