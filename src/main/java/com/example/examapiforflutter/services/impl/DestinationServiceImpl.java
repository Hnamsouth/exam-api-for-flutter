package com.example.examapiforflutter.services;


import com.example.examapiforflutter.repositories.DestinationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DestinationServiceImpl {
    private final DestinationRepository destinationRepository;
}
