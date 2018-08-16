package pl.krepec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.krepec.service.dto.StatusDTO;
import pl.krepec.service.repository.StatusRepository;
import pl.krepec.service.repository.model.Status;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    private StatusDTO mapStatus(Status status) {
        return new StatusDTO(status.getStatusId(), status.getStatus());
    }

    public Iterable<StatusDTO> getAllStatuses() {
        List<StatusDTO> statusDTOList = new ArrayList<>();
        Iterable<Status> statusList = statusRepository.findAll();

        for (Status status : statusList) {
            StatusDTO statusDTO = mapStatus(status);
            statusDTOList.add(statusDTO);
        }
        return statusDTOList;
    }

    public StatusDTO findById(Long statusId) {
        Status status = statusRepository.findOne(statusId);
        StatusDTO statusDTO = mapStatus(status);

        return statusDTO;
    }

    public Status addNewStatus(StatusDTO statusDTO) {
        return statusRepository.save(new Status(statusDTO.getStatusId(), statusDTO.getStatus()));
    }


}
