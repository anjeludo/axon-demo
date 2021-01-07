package com.anjeludo.axon.shared.valueobject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Embeddable;

import com.anjeludo.axon.shared.noarg.NoArgsConstructor;


@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@NoArgsConstructor
@Embeddable
public @interface ValueObject {

}
