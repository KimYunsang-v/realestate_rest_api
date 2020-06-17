package kr.ac.skuniv.realestate.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = 2126420044L;

    public static final QBoard board = new QBoard("board");

    public final ListPath<Answer, QAnswer> answers = this.<Answer, QAnswer>createList("answers", Answer.class, QAnswer.class, PathInits.DIRECT2);

    public final StringPath author = createString("author");

    public final StringPath city = createString("city");

    public final StringPath content = createString("content");

    public final StringPath district = createString("district");

    public final DatePath<java.util.Date> modifyDate = createDate("modifyDate", java.util.Date.class);

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final DatePath<java.util.Date> registerDate = createDate("registerDate", java.util.Date.class);

    public final StringPath title = createString("title");

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

