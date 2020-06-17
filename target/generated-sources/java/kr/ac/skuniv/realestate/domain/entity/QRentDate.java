package kr.ac.skuniv.realestate.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRentDate is a Querydsl query type for RentDate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRentDate extends EntityPathBase<RentDate> {

    private static final long serialVersionUID = -384856223L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRentDate rentDate = new QRentDate("rentDate");

    public final QBuilding building;

    public final DatePath<java.util.Date> date = createDate("date", java.util.Date.class);

    public final NumberPath<Integer> guaranteePrice = createNumber("guaranteePrice", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> monthlyPrice = createNumber("monthlyPrice", Integer.class);

    public QRentDate(String variable) {
        this(RentDate.class, forVariable(variable), INITS);
    }

    public QRentDate(Path<? extends RentDate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRentDate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRentDate(PathMetadata metadata, PathInits inits) {
        this(RentDate.class, metadata, inits);
    }

    public QRentDate(Class<? extends RentDate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.building = inits.isInitialized("building") ? new QBuilding(forProperty("building")) : null;
    }

}

