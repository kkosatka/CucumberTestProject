package com.daedalus.stepsDef;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.daedalus.utilities.YamlReader;

import java.util.List;

public class TestData {
    public static void main(String... st) {
       

        AWSCredentials credentials = new BasicAWSCredentials(
                YamlReader.getData("accessKey"),
                YamlReader.getData("secretKey")
        );

        AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        List<Bucket> buckets = s3client.listBuckets();
        System.out.println(buckets.size()+"*****************");
        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }
    }
}
