package kr.ac.skuniv.realestate.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBargainDate is a Querydsl query type for BargainDate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBargainDate extends EntityPathBase<BargainDate> {

    private static final long serialVersionUID = -2142693946L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBargainDate bargainDate = new QBargainDate("bargainDate");

    public final QBuilding building;

    public final DatePath<java.util.Date> date = createDate("date", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Double> pyPrice = createNumber("pyPrice", Double.class);

    public QBargainDate(String variable) {
        this(BargainDate.class, forVariable(variable), INITS);
    }

    public QBargainDate(Path<? extends BargainDate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBargainDate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBargainDate(PathMetadata metadata, PathInits inits) {
        this(BargainDate.class, metadata, inits);
    }

    public QBargainDate(Class<? extends BargainDate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.building = inits.isInitialized("building") ? new QBuilding(forProperty("building")) : null;
    }

}

