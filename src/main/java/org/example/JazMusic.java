package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;




public class JazMusic implements Music {
        @Override
        public String getSong() {
            return "Jaz";
        }
    }
