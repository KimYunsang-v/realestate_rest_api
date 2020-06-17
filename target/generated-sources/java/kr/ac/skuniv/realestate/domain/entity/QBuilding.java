package kr.ac.skuniv.realestate.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBuilding is a Querydsl query type for Building
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBuilding extends EntityPathBase<Building> {

    private static final long serialVersionUID = -1334433906L;

    public static final QBuilding building = new QBuilding("building");

    public final NumberPath<Double> area = createNumber("area", Double.class);

    public final ListPath<BargainDate, QBargainDate> bargainDates = this.<BargainDate, QBargainDate>createList("bargainDates", BargainDate.class, QBargainDate.class, PathInits.DIRECT2);

    public final NumberPath<Long> buildingNo = createNumber("buildingNo", Long.class);

    public final StringPath buildingNum = createString("buildingNum");

    public final ListPath<CharterDate, QCharterDate> charterDates = this.<CharterDate, QCharterDate>createList("charterDates", CharterDate.class, QCharterDate.class, PathInits.DIRECT2);

    public final NumberPath<Integer> city = createNumber("city", Integer.class);

    public final StringPath constructYear = createString("constructYear");

    public final StringPath dong = createString("dong");

    public final NumberPath<Integer> floor = createNumber("floor", Integer.class);

    public final NumberPath<Integer> groop = createNumber("groop", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<RentDate, QRentDate> rentDates = this.<RentDate, QRentDate>createList("rentDates", RentDate.class, QRentDate.class, PathInits.DIRECT2);

    public final StringPath type = createString("type");

    public QBuilding(String variable) {
        super(Building.class, forVariable(variable));
    }

    public QBuilding(Path<? extends Building> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBuilding(PathMetadata metadata) {
        super(Building.class, metadata);
    }

}

