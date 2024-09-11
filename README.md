# Dataformats

Dataformats provides support for dealing with java data objects with a large hierarchy. The goal is to represent the
hierarchy and values as a Data object so your code does not depend on the actual java objects. The abstract
representation of Data objects (the DataFormat) also allows transformations via Conversions. Support for the management
of the data formats, conversions, mappings and types is also provided via registries.

## Get started

Add to your build.gradle:
`implementation 'konrad.dataformats:dataformats-core:${dataformats-version}'`

1. Create two DataFormats, e.g. `DataFormat.fromCsv(new DataFormatId(aClass.getName()), csvLines));`
2. Create a Conversion, e.g. `Conversion.fromCsv(fromFormat, toFormat, csvLines, mappingGenerators);`
3. Convert your java object to a map with `new ObjectMapper().convertValue(object, new TypeReference<>() {});`
4. Create a Data object from the map with `Data.from(map, format)`
5. Use the Data object to pass the data
6. Use the Data object to convert the data to another format, e.g. `conversion.applyTo(data)`
7. Convert the Data object to a map with `data.toMap()`
8. Convert the map back to the java object with `new ObjectMapper().convertValue(map, aClass)`

## Maintainer and contributions

Maintainer of the project is: Andreas Konrad https://github.com/konnika

If you want to contribute please contact me.

## LICENSE

This repository is released under the GNU GENERAL PUBLIC LICENSE.




