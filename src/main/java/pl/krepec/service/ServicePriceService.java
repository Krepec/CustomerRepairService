package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.ServicePriceDTO;
import pl.krepec.service.repository.ServicePriceRepository;
import pl.krepec.service.repository.model.ServicePrice;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePriceService {

    @Autowired
    private ServicePriceRepository servicePriceRepository;


    private ServicePriceDTO mapServiceProice(ServicePrice servicePrice) {
        return new ServicePriceDTO(servicePrice.getServicePriceId(), servicePrice.getServiceName(),
                servicePrice.getServiceLevel(), servicePrice.getServicePrice());
    }


    public ServicePriceDTO findByServicePriceId(Long servicePriceId) {
        ServicePrice service = servicePriceRepository.findOne(servicePriceId);
        return mapServiceProice(service);
    }



    public List<ServicePriceDTO> getAllServices() {
        List<ServicePriceDTO> servicePriceDTOList = new ArrayList<>();
        Iterable<ServicePrice> service = servicePriceRepository.findAll();

        for (ServicePrice servicePrice : service) {
            ServicePriceDTO servicePriceDTO = mapServiceProice(servicePrice);
            servicePriceDTOList.add(servicePriceDTO);
        }
        return servicePriceDTOList;
    }

    public Long addNewServicePrice(ServicePriceDTO servicePriceDTO){
    ServicePrice servicePrice =  servicePriceRepository.save(new ServicePrice(servicePriceDTO.getServicePriceId(),servicePriceDTO.getServiceName(),
            servicePriceDTO.getServiceLevel(),servicePriceDTO.getServicePrice()));
    return  servicePrice.getServicePriceId();
    }
}
