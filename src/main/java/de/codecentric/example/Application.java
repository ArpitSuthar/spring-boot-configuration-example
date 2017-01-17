/*
 * Copyright 2016 codecentric AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.codecentric.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    TypeSafeConfiguration typeSafeConfiguration;

    @Autowired
    AnnotationConfiguration annotationConfiguration;

    public static void main(String[] args) {
       SpringApplication.run(Application.class,args);
    }

    private static void info(String text) {
        System.out.println(String.format("Application.java: %s", text));
    }

    @Override
    public void run(String... args) throws Exception {
        info("Applicaion properies are as below:");
        info(typeSafeConfiguration.toString());
        info(annotationConfiguration.toString());
    }
}
