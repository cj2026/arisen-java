package one.block.arisenjava.interfaces;

import one.block.arisenjava.error.serializationProvider.DeserializeAbiError;
import one.block.arisenjava.error.serializationProvider.DeserializeError;
import one.block.arisenjava.error.serializationProvider.DeserializeTransactionError;
import one.block.arisenjava.error.serializationProvider.SerializeAbiError;
import one.block.arisenjava.error.serializationProvider.SerializeError;
import one.block.arisenjava.error.serializationProvider.SerializeTransactionError;
import one.block.arisenjava.models.AbiRixSerializationObject;

/**
 * Interface of Serialization Provider
 */
public interface ISerializationProvider {

    /**
     * Perform a deserialization process to convert a hex string to a JSON string given the parameters
     * provided in the input deserilizationObject.  The result will be placed in the json field of
     * the deserilizationObject and can be accessed with getJson().
     *
     * @param deserilizationObject Input object passing the hex string to be converted as well
     * as other parameters to control the deserialization process.
     * @throws DeserializeError A deserialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    void deserialize(AbiRixSerializationObject deserilizationObject) throws DeserializeError;

    /**
     * Perform a serialization process to convert a JSON string to a HEX string given the parameters
     * provided in the input serializationObject.  The result will be placed in the hex field of
     * the serializationObject and can be accessed with getHex().
     *
     * @param serializationObject Input object passing the JSON string to be converted as well
     * as other parameters to control the serialization process.
     * @throws SerializeError A serialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    void serialize(AbiRixSerializationObject serializationObject) throws SerializeError;

    /**
     * Convenience method to transform a transaction hex string to a JSON string.
     *
     * @param hex Hex string representing the transaction to deserialize.
     * @return Deserialized JSON string representing the transaction hex.
     * @throws DeserializeTransactionError A deserialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    String deserializeTransaction(String hex) throws DeserializeTransactionError;

    /**
     * Convenience method to transform a transaction JSON string to a hex string.
     *
     * @param json JSON string representing the transaction to serialize.
     * @return Serialized hex string representing the transaction JSON.
     * @throws SerializeTransactionError A serialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    String serializeTransaction(String json) throws SerializeTransactionError;

    /**
     * Convenience method to transform an ABI hex string to a JSON string.
     *
     * @param hex Hex string representing the ABI to deserialize.
     * @return Deserialized JSON string representing the ABI hex.
     * @throws DeserializeAbiError A deserialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    String deserializeAbi(String hex) throws DeserializeAbiError;

    /**
     * Convenience method to transform an ABI JSON string to a hex string.
     *
     * @param json JSON string representing the ABI to serialize.
     * @return Serialized hex string representing the ABI JSON.
     * @throws SerializeAbiError A serialization error is thrown if there are any exceptions during the
     * conversion process.
     */
    String serializeAbi(String json) throws SerializeAbiError;
}
