package tobyspring.config;

import org.springframework.core.type.AnnotationMetadata;

public interface DefferedImportSelector {
    String[] selectImports(AnnotationMetadata importingClassMetadata);
}
