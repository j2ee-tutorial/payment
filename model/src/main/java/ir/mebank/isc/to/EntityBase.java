package ir.mebank.isc.to;

import ir.mebank.isc.to.base.Audit;
import ir.mebank.isc.to.base.Auditable;
import ir.mebank.isc.to.base.Printable;
import ir.mebank.isc.to.listener.AuditListener;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(AuditListener.class)
public abstract class EntityBase implements Auditable, Printable {

    @Id
    @GeneratedValue(generator = "SEQUENCE_GENERATOR", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private final Audit audit;

    EntityBase() {
        audit = new Audit();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Audit getAudit() {
        return audit;
    }
}
