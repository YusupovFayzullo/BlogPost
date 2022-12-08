package uz.pdp.blogpost.backend.services.base;

import uz.pdp.blogpost.backend.criteria.GenericCriteria;
import uz.pdp.blogpost.backend.dtos.DTO;

import java.io.Serializable;
import java.util.List;

public interface  GenericService<D extends DTO, ID extends Serializable, C extends GenericCriteria> {

	D get(ID id);

	List<D> getAll(C criteria);

}
