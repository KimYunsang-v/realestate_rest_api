package kr.ac.skuniv.realestate.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCharterDate is a Querydsl query type for CharterDate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCharterDate extends EntityPathBase<CharterDate> {

    private static final long serialVersionUID = 1204604991L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCharterDate charterDate = new QCharterDate("charterDate");

    public final QBuilding building;

    public final DatePath<java.util.Date> date = createDate("date", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Double> pyPrice = createNumber("pyPrice", Double.class);

    public QCharterDate(String variable) {
        this(CharterDate.class, forVariable(variable), INITS);
    }

    public QCharterDate(Path<? extends CharterDate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCharterDate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCharterDate(PathMetadata metadata, PathInits inits) {
        this(CharterDate.class, metadata, inits);
    }

    public QCharterDate(Class<? extends CharterDate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.building = inits.isInitialized("building") ? new QBuilding(forProperty("building")) : null;
    }

}

