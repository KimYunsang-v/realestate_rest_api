package kr.ac.skuniv.realestate.domain.dto;

import com.querydsl.core.types.ConstructorExpression;
import kr.ac.skuniv.realestate.domain.dto.searchDto.SearchResDto;

import javax.annotation.Generated;

/**
 * kr.ac.skuniv.realestate.domain.dto.QSearchResDto is a Querydsl Projection type for SearchResDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QSearchResDto extends ConstructorExpression<SearchResDto> {

    private static final long serialVersionUID = 1594142599L;

    public QSearchResDto(com.querydsl.core.types.Expression<String> dong, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Double> area, com.querydsl.core.types.Expression<Integer> floor, com.querydsl.core.types.Expression<String> type, com.querydsl.core.types.Expression<String> buildingNum, com.querydsl.core.types.Expression<String> constructorYear, com.querydsl.core.types.Expression<Double> price, com.querydsl.core.types.Expression<Double> dealType, com.querydsl.core.types.Expression<? extends java.util.Date> date) {
        super(SearchResDto.class, new Class<?>[]{String.class, String.class, double.class, int.class, String.class, String.class, String.class, double.class, double.class, java.util.Date.class}, dong, name, area, floor, type, buildingNum, constructorYear, price, dealType, date);
    }

}

