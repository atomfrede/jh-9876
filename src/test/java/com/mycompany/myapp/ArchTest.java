package com.mycompany.myapp;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    @DisplayName("Services and Repositories should not depend on web layer")
    void services_and_repositories_should_not_depend_on_web_layer() {

        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.mycompany.myapp");

        noClasses()
            .that()
                .resideInAnyPackage("..service..")
            .or()
                .resideInAnyPackage("..repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.mycompany.myapp.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
