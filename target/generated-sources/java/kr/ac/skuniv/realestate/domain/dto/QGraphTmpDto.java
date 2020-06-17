package kr.ac.skuniv.realestate.domain.dto;

import com.querydsl.core.types.ConstructorExpression;
import kr.ac.skuniv.realestate.domain.dto.graphDto.GraphTmpDto;

import javax.annotation.Generated;

/**
 * kr.ac.skuniv.realestate.domain.dto.QGraphTmpDto is a Querydsl Projection type for GraphTmpDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QGraphTmpDto extends ConstructorExpression<GraphTmpDto> {

    private static final long serialVersionUID = -1178853994L;

    public QGraphTmpDto(com.querydsl.core.types.Expression<String> housingType, com.querydsl.core.types.Expression<? extends java.util.Date> date, com.querydsl.core.types.Expression<Double> average) {
        super(GraphTmpDto.class, new Class<?>[]{String.class, java.util.Date.class, double.class}, housingType, date, average);
    }

}

