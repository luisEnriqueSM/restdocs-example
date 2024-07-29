package org.beer.works.restdocs.web.mappers;

import org.beer.works.restdocs.domain.Beer;
import org.beer.works.restdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
