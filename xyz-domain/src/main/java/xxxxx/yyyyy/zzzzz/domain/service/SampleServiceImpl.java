package xxxxx.yyyyy.zzzzz.domain.service;

import org.springframework.stereotype.Service;
import xxxxx.yyyyy.zzzzz.domain.model.Sample;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public Sample service() {
        Sample sample = new Sample();
        sample.setValue("Hello, World!");
        return sample;
    }
}
