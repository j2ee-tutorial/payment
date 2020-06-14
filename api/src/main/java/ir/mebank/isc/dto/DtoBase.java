package ir.mebank.isc.dto;

public abstract class DtoBase {

    private Long id;

    private final com.tasnim.trade.eshop.dto.base.Audit audit;

    private DtoBase(com.tasnim.trade.eshop.dto.base.Audit audit) {
        this.audit = audit;
    }

    DtoBase() {
        this(new com.tasnim.trade.eshop.dto.base.Audit());
    }

    public DtoBase(Long id) {
        this(new com.tasnim.trade.eshop.dto.base.Audit());
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.tasnim.trade.eshop.dto.base.Audit getAudit() {
        return audit;
    }
}
