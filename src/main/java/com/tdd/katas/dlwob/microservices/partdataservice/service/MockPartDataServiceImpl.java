package com.tdd.katas.dlwob.microservices.partdataservice.service;

import com.fasterxml.jackson.core.type.TypeReference;

import com.tdd.katas.dlwob.microservices.partdataservice.model.PartData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hexad GmbH on 24/05/2017.
 */
@Service
public class MockPartDataServiceImpl extends AbstractMockServiceImpl<List<PartData>> implements PartDataService {

    protected MockPartDataServiceImpl() {
        super(new TypeReference<List<PartData>>(){});
    }

    @Override
    public List<PartData> getPartData(String vinCode) {

        if(MockServicesConstants.SAMPLE_VEHICLE_VIN_CODE.equals(vinCode))
            return dtoObject;
        else
            return null;

    }
}
