package uz.pdp.blogpost.backend.services.base;


import uz.pdp.blogpost.backend.criteria.GenericCriteria;
import uz.pdp.blogpost.backend.dtos.DTO;
import uz.pdp.blogpost.backend.dtos.GenericDTO;

import java.io.Serializable;

public interface GenericCrudService<
		D extends GenericDTO,
		CD extends DTO,
		UD extends GenericDTO,
		ID extends Serializable,
		C extends GenericCriteria>
		extends  GenericService<D, ID, C> {

	ID create(CD dto);

	Boolean update(UD dto);

	Boolean delete(ID id);





}
