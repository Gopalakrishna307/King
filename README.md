Certainly! To accomplish this MapReduce task in Python, you can use the following code for the mapper and reducer functions:

```python
import sys

class MapReduce:
    def __init__(self):
        self.intermediate = {}
        self.result = []

    def emit_intermediate(self, key, value):
        self.intermediate.setdefault(key, [])
        self.intermediate[key].append(value)

    def emit(self, key, value):
        self.result.append({"key": key, "value": value})

    def execute(self, data, mapper, reducer):
        for record in data:
            mapper(record)

        for key in self.intermediate:
            reducer(key, self.intermediate[key])

        self.result.sort(key=lambda x: x['key'])
        for item in self.result:
            print('{"key":"' + item['key'] + '","value":"' + str(item['value']) + '"}')


def mapper(record):
    # Parse the input data and emit intermediate key-value pairs
    friends = record.split()
    for friend in friends:
        MapReduce.emit_intermediate(friend, 1)


def reducer(key, list_of_values):
    # Sum up the values for each key and emit the final result
    total_friends = sum(list_of_values)
    MapReduce.emit(key, total_friends)


if __name__ == '__main__':
    input_data = ["Joe Sue", "Sue Phi", "Phi Joe", "Phi Alice"]

    MapReduce = MapReduce()
    MapReduce.execute(input_data, mapper, reducer)
```

This code initializes a basic MapReduce class and provides the mapper and reducer functions as specified in your task. The sample input data is provided in the `input_data` list. When executed, it will produce the desired output as shown in the sample output section of your task.
