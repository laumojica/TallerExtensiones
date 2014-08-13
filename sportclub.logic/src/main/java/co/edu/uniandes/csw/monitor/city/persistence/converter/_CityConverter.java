/* ========================================================================
 * Copyright 2014 monitor
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 monitor

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.monitor.city.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.monitor.city.logic.dto.CityDTO;
import co.edu.uniandes.csw.monitor.city.persistence.entity.CityEntity;

public abstract class _CityConverter {

	public static CityDTO entity2PersistenceDTO(CityEntity entity){
		if (entity != null) {
			CityDTO dto = new CityDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setPopulation(entity.getPopulation());
					dto.setCountryId(entity.getCountryId());
			return dto;
		}else{
			return null;
		}
	}
	
	public static CityEntity persistenceDTO2Entity(CityDTO dto){
		if(dto!=null){
			CityEntity entity=new CityEntity();
					entity.setId(dto.getId());
			
					entity.setName(dto.getName());
			
					entity.setPopulation(dto.getPopulation());
			
					entity.setCountryId(dto.getCountryId());
			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<CityDTO> entity2PersistenceDTOList(List<CityEntity> entities){
		List<CityDTO> dtos=new ArrayList<CityDTO>();
		for(CityEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<CityEntity> persistenceDTO2EntityList(List<CityDTO> dtos){
		List<CityEntity> entities=new ArrayList<CityEntity>();
		for(CityDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}