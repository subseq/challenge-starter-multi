package net.subseq.challenge.controller;

import net.subseq.challenge.data.RandomData;
import net.subseq.challenge.data.SampleRandomObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleApiController {

    @RequestMapping("/sample")
    public SampleRandomObject sampleMapping() {
        return RandomData.getSampleRandomDataObject();
    }

}
