// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragments_with_type_condition_nullable

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.DEFAULT
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.example.fragments_with_type_condition_nullable.fragment.DroidDetails
import com.example.fragments_with_type_condition_nullable.fragment.HumanDetails
import java.io.IOException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.Throws
import okio.BufferedSource

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
class TestQuery : Query<TestQuery.Data, TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID
  override fun queryDocument(): String = QUERY_DOCUMENT
  override fun wrapData(data: Data?): Data? = data
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES
  override fun name(): OperationName = OPERATION_NAME
  override fun responseFieldMapper(): ResponseFieldMapper<Data> = ResponseFieldMapper {
    Data(it)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> = parse(source, DEFAULT)

  data class R2(
    val __typename: String = "Character",
    val fragments: Fragments
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@R2.__typename)
      this@R2.fragments.marshaller().marshal(writer)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("__typename", "__typename", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): R2 = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])
        val fragments = Fragments(reader)
        R2(
          __typename = __typename,
          fragments = fragments
        )
      }
    }

    data class Fragments(
      val humanDetails: HumanDetails?,
      val droidDetails: DroidDetails?
    ) {
      fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
        writer.writeFragment(this@Fragments.humanDetails?.marshaller())
        writer.writeFragment(this@Fragments.droidDetails?.marshaller())
      }

      companion object {
        private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField.forFragment("__typename", "__typename", listOf(
              ResponseField.Condition.typeCondition(arrayOf("Human"))
            )),
            ResponseField.forFragment("__typename", "__typename", listOf(
              ResponseField.Condition.typeCondition(arrayOf("Droid"))
            ))
            )

        operator fun invoke(reader: ResponseReader): Fragments = reader.run {
          val humanDetails = readFragment<HumanDetails>(RESPONSE_FIELDS[0]) { reader ->
            HumanDetails(reader)
          }
          val droidDetails = readFragment<DroidDetails>(RESPONSE_FIELDS[1]) { reader ->
            DroidDetails(reader)
          }
          Fragments(
            humanDetails = humanDetails,
            droidDetails = droidDetails
          )
        }
      }
    }
  }

  data class Luke(
    val __typename: String = "Character",
    val fragments: Fragments
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Luke.__typename)
      this@Luke.fragments.marshaller().marshal(writer)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("__typename", "__typename", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Luke = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])
        val fragments = Fragments(reader)
        Luke(
          __typename = __typename,
          fragments = fragments
        )
      }
    }

    data class Fragments(
      val humanDetails: HumanDetails?,
      val droidDetails: DroidDetails?
    ) {
      fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
        writer.writeFragment(this@Fragments.humanDetails?.marshaller())
        writer.writeFragment(this@Fragments.droidDetails?.marshaller())
      }

      companion object {
        private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField.forFragment("__typename", "__typename", listOf(
              ResponseField.Condition.typeCondition(arrayOf("Human"))
            )),
            ResponseField.forFragment("__typename", "__typename", listOf(
              ResponseField.Condition.typeCondition(arrayOf("Droid"))
            ))
            )

        operator fun invoke(reader: ResponseReader): Fragments = reader.run {
          val humanDetails = readFragment<HumanDetails>(RESPONSE_FIELDS[0]) { reader ->
            HumanDetails(reader)
          }
          val droidDetails = readFragment<DroidDetails>(RESPONSE_FIELDS[1]) { reader ->
            DroidDetails(reader)
          }
          Fragments(
            humanDetails = humanDetails,
            droidDetails = droidDetails
          )
        }
      }
    }
  }

  data class Data(
    val r2: R2?,
    val luke: Luke?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller { writer ->
      writer.writeObject(RESPONSE_FIELDS[0], this@Data.r2?.marshaller())
      writer.writeObject(RESPONSE_FIELDS[1], this@Data.luke?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forObject("r2", "hero", null, true, null),
          ResponseField.forObject("luke", "hero", null, true, null)
          )

      operator fun invoke(reader: ResponseReader): Data = reader.run {
        val r2 = readObject<R2>(RESPONSE_FIELDS[0]) { reader ->
          R2(reader)
        }
        val luke = readObject<Luke>(RESPONSE_FIELDS[1]) { reader ->
          Luke(reader)
        }
        Data(
          r2 = r2,
          luke = luke
        )
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "919cec7210259fa24fc6026fe680b96f357c14ebf3c8a734979dcfb819685d6a"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  r2: hero {
          |    __typename
          |    ...HumanDetails
          |    ...DroidDetails
          |  }
          |  luke: hero {
          |    __typename
          |    ...HumanDetails
          |    ...DroidDetails
          |  }
          |}
          |fragment HumanDetails on Human {
          |  __typename
          |  name
          |  height
          |}
          |fragment DroidDetails on Droid {
          |  __typename
          |  name
          |  primaryFunction
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = OperationName { "TestQuery" }
  }
}
