/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.s3.AWS2S3Component;

/**
 * The aws2-s3 component is used for storing and retrieving object from Amazon
 * S3 Storage Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2S3ComponentBuilderFactory {

    /**
     * AWS2 S3 Storage Service (camel-aws2-s3)
     * The aws2-s3 component is used for storing and retrieving object from
     * Amazon S3 Storage Service.
     * 
     * Category: cloud,file
     * Since: 3.2
     * Maven coordinates: org.apache.camel:camel-aws2-s3
     */
    static Aws2S3ComponentBuilder aws2S3() {
        return new Aws2S3ComponentBuilderImpl();
    }

    /**
     * Builder for the AWS2 S3 Storage Service component.
     */
    interface Aws2S3ComponentBuilder
            extends
                ComponentBuilder<AWS2S3Component> {
        /**
         * Reference to a com.amazonaws.services.s3.AmazonS3 in the registry.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.s3.S3Client</code> type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder amazonS3Client(
                software.amazon.awssdk.services.s3.S3Client amazonS3Client) {
            doSetProperty("amazonS3Client", amazonS3Client);
            return this;
        }
        /**
         * Setting the autocreation of the bucket.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Aws2S3ComponentBuilder autoCreateBucket(boolean autoCreateBucket) {
            doSetProperty("autoCreateBucket", autoCreateBucket);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.s3.AWS2S3Configuration</code>
         * type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder configuration(
                org.apache.camel.component.aws2.s3.AWS2S3Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The policy for this queue to set in the
         * com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SQS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Specify a proxy port to be used inside the client definition.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the S3 client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: common
         */
        default Aws2S3ComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which S3 client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default Aws2S3ComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Set whether the S3 client should expect to load credentials on an EC2
         * instance or to expect static credentials to be passed in.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default Aws2S3ComponentBuilder useIAMCredentials(
                boolean useIAMCredentials) {
            doSetProperty("useIAMCredentials", useIAMCredentials);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default Aws2S3ComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Delete objects from S3 after they have been retrieved. The delete is
         * only performed if the Exchange is committed. If a rollback occurs,
         * the object is not deleted. If this option is false, then the same
         * objects will be retrieve over and over again on the polls. Therefore
         * you need to use the Idempotent Consumer EIP in the route to filter
         * out duplicates. You can filter using the AWS2S3Constants#BUCKET_NAME
         * and AWS2S3Constants#KEY headers, or only the AWS2S3Constants#KEY
         * header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default Aws2S3ComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
        /**
         * The delimiter which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2S3ComponentBuilder delimiter(java.lang.String delimiter) {
            doSetProperty("delimiter", delimiter);
            return this;
        }
        /**
         * To get the object from the bucket with the given file name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2S3ComponentBuilder fileName(java.lang.String fileName) {
            doSetProperty("fileName", fileName);
            return this;
        }
        /**
         * If it is true, the exchange body will be set to a stream to the
         * contents of the file. If false, the headers will be set with the S3
         * object metadata, but the body will be null. This option is strongly
         * related to autocloseBody option. In case of setting includeBody to
         * true and autocloseBody to false, it will be up to the caller to close
         * the S3Object stream. Setting autocloseBody to true, will close the
         * S3Object stream automatically.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default Aws2S3ComponentBuilder includeBody(boolean includeBody) {
            doSetProperty("includeBody", includeBody);
            return this;
        }
        /**
         * The prefix which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default Aws2S3ComponentBuilder prefix(java.lang.String prefix) {
            doSetProperty("prefix", prefix);
            return this;
        }
        /**
         * If this option is true and includeBody is true, then the
         * S3Object.close() method will be called on exchange completion. This
         * option is strongly related to includeBody option. In case of setting
         * includeBody to true and autocloseBody to false, it will be up to the
         * caller to close the S3Object stream. Setting autocloseBody to true,
         * will close the S3Object stream automatically.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer (advanced)
         */
        default Aws2S3ComponentBuilder autocloseBody(boolean autocloseBody) {
            doSetProperty("autocloseBody", autocloseBody);
            return this;
        }
        /**
         * Delete file object after the S3 file has been uploaded.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2S3ComponentBuilder deleteAfterWrite(boolean deleteAfterWrite) {
            doSetProperty("deleteAfterWrite", deleteAfterWrite);
            return this;
        }
        /**
         * Setting the key name for an element in the bucket through endpoint
         * parameter.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2S3ComponentBuilder keyName(java.lang.String keyName) {
            doSetProperty("keyName", keyName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2S3ComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * If it is true, camel will upload the file with multi part format, the
         * part size is decided by the option of partSize.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2S3ComponentBuilder multiPartUpload(boolean multiPartUpload) {
            doSetProperty("multiPartUpload", multiPartUpload);
            return this;
        }
        /**
         * The operation to do in case the user don't want to do only an upload.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.s3.AWS2S3Operations</code>
         * type.
         * 
         * Group: producer
         */
        default Aws2S3ComponentBuilder operation(
                org.apache.camel.component.aws2.s3.AWS2S3Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Setup the partSize which is used in multi part upload, the default
         * size is 25M.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 26214400
         * Group: producer
         */
        default Aws2S3ComponentBuilder partSize(long partSize) {
            doSetProperty("partSize", partSize);
            return this;
        }
        /**
         * The storage class to set in the
         * com.amazonaws.services.s3.model.PutObjectRequest request.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2S3ComponentBuilder storageClass(
                java.lang.String storageClass) {
            doSetProperty("storageClass", storageClass);
            return this;
        }
        /**
         * Define the id of KMS key to use in case KMS is enabled.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer (advanced)
         */
        default Aws2S3ComponentBuilder awsKMSKeyId(java.lang.String awsKMSKeyId) {
            doSetProperty("awsKMSKeyId", awsKMSKeyId);
            return this;
        }
        /**
         * Define if KMS must be used or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         */
        default Aws2S3ComponentBuilder useAwsKMS(boolean useAwsKMS) {
            doSetProperty("useAwsKMS", useAwsKMS);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Aws2S3ComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2S3ComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2S3ComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2S3ComponentBuilderImpl
            extends
                AbstractComponentBuilder<AWS2S3Component>
            implements
                Aws2S3ComponentBuilder {
        @Override
        protected AWS2S3Component buildConcreteComponent() {
            return new AWS2S3Component();
        }
        private org.apache.camel.component.aws2.s3.AWS2S3Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.s3.AWS2S3Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.s3.AWS2S3Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonS3Client": getOrCreateConfiguration((AWS2S3Component) component).setAmazonS3Client((software.amazon.awssdk.services.s3.S3Client) value); return true;
            case "autoCreateBucket": getOrCreateConfiguration((AWS2S3Component) component).setAutoCreateBucket((boolean) value); return true;
            case "configuration": ((AWS2S3Component) component).setConfiguration((org.apache.camel.component.aws2.s3.AWS2S3Configuration) value); return true;
            case "policy": getOrCreateConfiguration((AWS2S3Component) component).setPolicy((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((AWS2S3Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((AWS2S3Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((AWS2S3Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((AWS2S3Component) component).setRegion((java.lang.String) value); return true;
            case "useIAMCredentials": getOrCreateConfiguration((AWS2S3Component) component).setUseIAMCredentials((boolean) value); return true;
            case "bridgeErrorHandler": ((AWS2S3Component) component).setBridgeErrorHandler((boolean) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((AWS2S3Component) component).setDeleteAfterRead((boolean) value); return true;
            case "delimiter": getOrCreateConfiguration((AWS2S3Component) component).setDelimiter((java.lang.String) value); return true;
            case "fileName": getOrCreateConfiguration((AWS2S3Component) component).setFileName((java.lang.String) value); return true;
            case "includeBody": getOrCreateConfiguration((AWS2S3Component) component).setIncludeBody((boolean) value); return true;
            case "prefix": getOrCreateConfiguration((AWS2S3Component) component).setPrefix((java.lang.String) value); return true;
            case "autocloseBody": getOrCreateConfiguration((AWS2S3Component) component).setAutocloseBody((boolean) value); return true;
            case "deleteAfterWrite": getOrCreateConfiguration((AWS2S3Component) component).setDeleteAfterWrite((boolean) value); return true;
            case "keyName": getOrCreateConfiguration((AWS2S3Component) component).setKeyName((java.lang.String) value); return true;
            case "lazyStartProducer": ((AWS2S3Component) component).setLazyStartProducer((boolean) value); return true;
            case "multiPartUpload": getOrCreateConfiguration((AWS2S3Component) component).setMultiPartUpload((boolean) value); return true;
            case "operation": getOrCreateConfiguration((AWS2S3Component) component).setOperation((org.apache.camel.component.aws2.s3.AWS2S3Operations) value); return true;
            case "partSize": getOrCreateConfiguration((AWS2S3Component) component).setPartSize((long) value); return true;
            case "storageClass": getOrCreateConfiguration((AWS2S3Component) component).setStorageClass((java.lang.String) value); return true;
            case "awsKMSKeyId": getOrCreateConfiguration((AWS2S3Component) component).setAwsKMSKeyId((java.lang.String) value); return true;
            case "useAwsKMS": getOrCreateConfiguration((AWS2S3Component) component).setUseAwsKMS((boolean) value); return true;
            case "basicPropertyBinding": ((AWS2S3Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((AWS2S3Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((AWS2S3Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}