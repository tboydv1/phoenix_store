package com.phoenix.service.cloud;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Map;

@Service("cloudinary")
public class CloudinaryServiceImpl implements CloudService {


    @Override
    public Map<?, ?> upload(File file, Map<?, ?> params) {
        return null;
    }
}