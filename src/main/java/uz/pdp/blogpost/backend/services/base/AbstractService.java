package uz.pdp.blogpost.backend.services.base;

import com.google.gson.Gson;
import uz.pdp.blogpost.backend.daos.AbstractDAO;
import uz.pdp.blogpost.backend.mapper.Mapper;
import uz.pdp.blogpost.backend.utils.BaseUtil;
import uz.pdp.blogpost.backend.utils.validators.BaseValidator;

public class AbstractService<R extends AbstractDAO, M extends Mapper, V extends BaseValidator >{

	protected final R dao;
	protected final M mapper;
	protected final V validator;
	protected final BaseUtil util;

	public AbstractService(R dao, M mapper, V validator) {
		this.validator = validator;
		this.dao = dao;
		this.mapper = mapper;
		this.util = new BaseUtil();
	}

}

