package io.github.mat3e;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("task")
public class TaskConfigurationProperties {
    private Template template;

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public static class Template {
        private boolean allowMultiplateTasks;

        public boolean isAllowMultiplateTasks() {
            return allowMultiplateTasks;
        }

        public void setAllowMultiplateTasks(boolean allowMultiplateTasks) {
            this.allowMultiplateTasks = allowMultiplateTasks;
        }
    }

}
