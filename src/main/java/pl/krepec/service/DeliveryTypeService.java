package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.CustomerDTO;
import pl.krepec.service.dto.DeliveryTypeDTO;
import pl.krepec.service.repository.DeliveryTypeRepository;
import pl.krepec.service.repository.model.Customer;
import pl.krepec.service.repository.model.DeliveryType;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryTypeService {

    @Autowired
    private DeliveryTypeRepository deliveryTypeRepository;

    private DeliveryTypeDTO mapDeliveryType(DeliveryType deliveryType) {

        return new DeliveryTypeDTO(deliveryType.getDeliveryTypeId(), deliveryType.getDeliveryType());
    }

    public Iterable<DeliveryTypeDTO> getAllDeliteryTypes() {
        List<DeliveryTypeDTO> deliveryTypeDTOList = new ArrayList<DeliveryTypeDTO>();
        Iterable<DeliveryType> deliveryTypes = deliveryTypeRepository.findAll();

        for (DeliveryType deliveryType : deliveryTypes) {
            DeliveryTypeDTO deliveryTypeDTO = mapDeliveryType(deliveryType);
            deliveryTypeDTOList.add(deliveryTypeDTO);
        }
        return deliveryTypeDTOList;
    }

    public DeliveryTypeDTO findById(Long deliveryTypeId) {
        DeliveryType deliveryType = deliveryTypeRepository.findOne(deliveryTypeId);
        return mapDeliveryType(deliveryType);
    }



    public Long addNewDelivertyType(DeliveryTypeDTO deliveryTypeDTO) {
        DeliveryType deliveryType = deliveryTypeRepository.save(new DeliveryType(deliveryTypeDTO.getDeliveryTypeId(), deliveryTypeDTO.getDeliveryType()));
        return deliveryType.getDeliveryTypeId();
    }


}
