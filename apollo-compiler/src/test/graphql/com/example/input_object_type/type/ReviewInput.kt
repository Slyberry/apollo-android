// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.input_object_type.type

import com.apollographql.apollo.api.Input
import com.apollographql.apollo.api.InputType
import com.apollographql.apollo.api.internal.InputFieldMarshaller
import com.apollographql.apollo.api.internal.InputFieldWriter
import java.util.Date
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

/**
 * The input object sent when someone is creating a new review
 */
@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class ReviewInput(
  /**
   * 0-5 stars
   */
  val stars: Int,
  /**
   * for test purpose only
   */
  val nullableIntFieldWithDefaultValue: Input<Int> = Input.optional(10),
  /**
   * Comment about the movie, optional
   */
  val commentary: Input<String> = Input.absent(),
  /**
   * Favorite color, optional
   */
  val favoriteColor: ColorInput,
  /**
   * for test purpose only
   */
  val enumWithDefaultValue: Input<Episode> = Input.optional(Episode.safeValueOf("JEDI")),
  /**
   * for test purpose only
   */
  val nonNullableEnumWithDefaultValue: Episode = Episode.safeValueOf("JEDI"),
  /**
   * for test purpose only
   */
  val nullableEnum: Input<Episode> = Input.absent(),
  /**
   * for test purpose only
   */
  val listOfCustomScalar: Input<List<Date?>> = Input.absent(),
  /**
   * for test purpose only
   */
  val customScalar: Input<Date> = Input.absent(),
  /**
   * for test purpose only
   */
  val listOfEnums: Input<List<Episode?>> = Input.optional(listOf(Episode.safeValueOf("NEWHOPE"),
      Episode.safeValueOf("EMPIRE"))),
  /**
   * for test purpose only
   */
  val listOfInt: Input<List<Int?>> = Input.optional(listOf(1, 2, 3)),
  /**
   * for test purpose only
   */
  val listOfString: Input<List<String?>> = Input.optional(listOf("test1", "test2", "test3")),
  /**
   * for test purpose only
   */
  val listOfStringNonOptional: List<String?>,
  /**
   * for test purpose only
   */
  val listOfInputTypes: Input<List<ColorInput?>> = Input.optional(emptyList()),
  /**
   * for test purpose only
   */
  val booleanWithDefaultValue: Input<Boolean> = Input.optional(true),
  /**
   * for test purpose only
   */
  val listOfListOfString: Input<List<List<String>>> = Input.absent(),
  /**
   * for test purpose only
   */
  val listOfListOfEnum: Input<List<List<Episode>>> = Input.absent(),
  /**
   * for test purpose only
   */
  val listOfListOfCustom: Input<List<List<Date>>> = Input.absent(),
  /**
   * for test purpose only
   */
  val listOfListOfObject: Input<List<List<ColorInput>>> = Input.absent(),
  /**
   * for test purpose only
   */
  val capitalizedField: Input<String> = Input.absent()
) : InputType {
  override fun marshaller(): InputFieldMarshaller = InputFieldMarshaller { writer ->
    writer.writeInt("stars", this@ReviewInput.stars)
    if (this@ReviewInput.nullableIntFieldWithDefaultValue.defined) {
      writer.writeInt("nullableIntFieldWithDefaultValue",
        this@ReviewInput.nullableIntFieldWithDefaultValue.value)
    }
    if (this@ReviewInput.commentary.defined) {
      writer.writeString("commentary", this@ReviewInput.commentary.value)
    }
    writer.writeObject("favoriteColor", this@ReviewInput.favoriteColor.marshaller())
    if (this@ReviewInput.enumWithDefaultValue.defined) {
      writer.writeString("enumWithDefaultValue",
        this@ReviewInput.enumWithDefaultValue.value?.rawValue)
    }
    writer.writeString("nonNullableEnumWithDefaultValue",
        this@ReviewInput.nonNullableEnumWithDefaultValue.rawValue)
    if (this@ReviewInput.nullableEnum.defined) {
      writer.writeString("nullableEnum", this@ReviewInput.nullableEnum.value?.rawValue)
    }
    if (this@ReviewInput.listOfCustomScalar.defined) {
      writer.writeList("listOfCustomScalar", this@ReviewInput.listOfCustomScalar.value?.let {
          value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeCustom(CustomType.DATE, value)
          }
        }
      })
    }
    if (this@ReviewInput.customScalar.defined) {
      writer.writeCustom("customScalar", CustomType.DATE, this@ReviewInput.customScalar.value)
    }
    if (this@ReviewInput.listOfEnums.defined) {
      writer.writeList("listOfEnums", this@ReviewInput.listOfEnums.value?.let { value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeString(value?.rawValue)
          }
        }
      })
    }
    if (this@ReviewInput.listOfInt.defined) {
      writer.writeList("listOfInt", this@ReviewInput.listOfInt.value?.let { value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeInt(value)
          }
        }
      })
    }
    if (this@ReviewInput.listOfString.defined) {
      writer.writeList("listOfString", this@ReviewInput.listOfString.value?.let { value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeString(value)
          }
        }
      })
    }
    writer.writeList("listOfStringNonOptional") { listItemWriter ->
      this@ReviewInput.listOfStringNonOptional.forEach { value ->
        listItemWriter.writeString(value)
      }
    }
    if (this@ReviewInput.listOfInputTypes.defined) {
      writer.writeList("listOfInputTypes", this@ReviewInput.listOfInputTypes.value?.let { value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())
          }
        }
      })
    }
    if (this@ReviewInput.booleanWithDefaultValue.defined) {
      writer.writeBoolean("booleanWithDefaultValue", this@ReviewInput.booleanWithDefaultValue.value)
    }
    if (this@ReviewInput.listOfListOfString.defined) {
      writer.writeList("listOfListOfString", this@ReviewInput.listOfListOfString.value?.let {
          value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeList { listItemWriter ->
              value.forEach { value ->
                listItemWriter.writeString(value)
              }
            }
          }
        }
      })
    }
    if (this@ReviewInput.listOfListOfEnum.defined) {
      writer.writeList("listOfListOfEnum", this@ReviewInput.listOfListOfEnum.value?.let { value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeList { listItemWriter ->
              value.forEach { value ->
                listItemWriter.writeString(value.rawValue)
              }
            }
          }
        }
      })
    }
    if (this@ReviewInput.listOfListOfCustom.defined) {
      writer.writeList("listOfListOfCustom", this@ReviewInput.listOfListOfCustom.value?.let {
          value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeList { listItemWriter ->
              value.forEach { value ->
                listItemWriter.writeCustom(CustomType.DATE, value)
              }
            }
          }
        }
      })
    }
    if (this@ReviewInput.listOfListOfObject.defined) {
      writer.writeList("listOfListOfObject", this@ReviewInput.listOfListOfObject.value?.let {
          value ->
        InputFieldWriter.ListWriter { listItemWriter ->
          value.forEach { value ->
            listItemWriter.writeList { listItemWriter ->
              value.forEach { value ->
                listItemWriter.writeObject(value.marshaller())
              }
            }
          }
        }
      })
    }
    if (this@ReviewInput.capitalizedField.defined) {
      writer.writeString("CapitalizedField", this@ReviewInput.capitalizedField.value)
    }
  }
}
