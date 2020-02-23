// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.directive_with_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class HumanDetails(
  val __typename: String = "Human",
  /**
   * The home planet of the human, or null if unknown
   */
  val homePlanet: String?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
    writer.writeString(RESPONSE_FIELDS[0], this@HumanDetails.__typename)
    writer.writeString(RESPONSE_FIELDS[1], this@HumanDetails.homePlanet)
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("homePlanet", "homePlanet", null, true, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment HumanDetails on Human {
        |  __typename
        |  homePlanet
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): HumanDetails = reader.run {
      val __typename = readString(RESPONSE_FIELDS[0])
      val homePlanet = readString(RESPONSE_FIELDS[1])
      HumanDetails(
        __typename = __typename,
        homePlanet = homePlanet
      )
    }
  }
}
