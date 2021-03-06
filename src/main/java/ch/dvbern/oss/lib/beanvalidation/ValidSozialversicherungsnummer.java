/*
 * Copyright 2017 DV Bern AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */

package ch.dvbern.oss.lib.beanvalidation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ch.dvbern.oss.lib.beanvalidation.impl.ValidSozialversicherungsnummerValidator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Validierung für Prüfziffer-Nummmern.
 */
@Target({ TYPE, ANNOTATION_TYPE, METHOD, FIELD })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { ValidSozialversicherungsnummerValidator.class })
public @interface ValidSozialversicherungsnummer {

	String message() default "{ungueltige.sozialversicherungsnummer}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
