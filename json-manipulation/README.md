# Prerequisites
- Use **Google GSON** for your JSON manipulation. It's already included in the
gradle build configuration for this subproject. The docs are here:
https://github.com/google/gson/blob/master/UserGuide.md

### Running your code
There is already a generic "main" method at `ai.brace.Main`. It is expected to
produce the expect output described in the rest of this file.

### While working on the tasks
Each task is expected to print text to standard out. The included static `main`
method should produce the output for all tasks in order, however please don't
bundle all of the functionality into a single `.java` file.

# Task 1
### Goal: "Load, parse, and sort"
- Load the `a1.json` file in the `resources` directory.
- Sort and print the contents (`textdata`) of `textArray` by ID, in ascending order.

The expected output:
```
  All this has nothing...
  It was a clear, cold day in January...
  I knew what I was doing when...
```

( N.B.: The output lines are long, so they're abbreviated with `...`. )

# Task 2
### Goal: "Merging data"
- Load both the `a1.json` and `a2.json` files from `resources`.
- Merge, sort, and print `textdata` in both `textArray` arrays by ID, in ascending order.

The expected output:
```
  All this has nothing...
  It was a clear, cold day in January...
  I knew what I was doing when...
  I did not have long to wait...
  I had of late climbed these...
  I walked on through well-ordered...
```

# Task 3
### Goal: "Simple analysis - a word frequency counter"
- Building on the data from both JSON files, count the word frequency
in the  `textArray` &#10132; `textdata` elements.

The expected output:
```
("Elderflowers".) : 1
(All) : 1
(An) : 1
(And) : 1
(But) : 1
(I) : 15
...
```

#### Bonus points (Don't get caught up on these.)
- Restrict the word characters to the regex `[A-Za-z]` (e.g. `door.` and `door` should be equivalent.) Don't stress too
  much over embedded non-word characters, (e.g. the word `well-ordered`)
- Furthermore `And` and `and` are equivalent, so your counter should be case-insensitive. Your keys should be stored in
  lowercase; if you're feeling clever, you could store the original text in another data structure, but that's above and
  beyond this test.
- Expected output:
  ```
  (a) : 11
  (afternoon) : 1
  (all) : 3
  (an) : 1
  (and) : 15
  (appreciate) : 1
  (arranged) : 1
  ...
  ```

# Task 4
### Goal: "Additive merging of JSON data"

Do as many of the following as you can:
- Merge the JSON files, from older to newer. The final JSON file should have the latest data. 
  - The merge is additive. That is, if the data element in the older JSON doesn't exist in the newer JSON, it will be copied to the newer JSON.
- Change the `lastModified` epoch datetime to an ISO format, e.g. `2010-01-01T12:00:00Z`
- Replace the `uuid` with a random one.
- Serialize the new JSON file to disk as `output.json`
  - Expected output should look like the `expectedOutput.json` file.
